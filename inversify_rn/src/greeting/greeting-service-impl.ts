import GreetingService from './greeting-service'
import { injectable, inject } from 'inversify'
import GreetingApi, { Symbols } from './greeting-api'

@injectable()
export default class GreetingServiceImpl implements GreetingService {

    private _greetingApi: GreetingApi

    constructor(@inject(Symbols.GreetingApi) greetingApi: GreetingApi) {
        console.log("init Greeting Service")
        this._greetingApi = greetingApi
    }

    hello(): string {
        return this._greetingApi.getGreeting()
    }
}