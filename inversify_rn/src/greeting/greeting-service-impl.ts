import GreetingService from './greeting-service'
import { injectable, inject } from 'inversify'
import GreetingApi, { Symbols } from './greeting-api'
import BaseServiceX, { Symbols as BaseSymbols } from '../base/service/base-service-x'

@injectable()
export default class GreetingServiceImpl implements GreetingService {

    private _greetingApi: GreetingApi
    private _baseServiceX: BaseServiceX

    constructor(
        @inject(Symbols.GreetingApi) greetingApi: GreetingApi,
        @inject(BaseSymbols.BaseServiceX) baseServiceX: BaseServiceX
    ) {
        console.log("init Greeting Service")
        this._greetingApi = greetingApi
        this._baseServiceX = baseServiceX
    }

    hello(): string {
        return this._greetingApi.getGreeting() + " " + this._baseServiceX.foo()
    }
}