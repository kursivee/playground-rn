import GreetingService from './greeting-service'
import { injectable } from 'inversify'

@injectable()
export default class GreetingServiceImpl implements GreetingService {
    hello(): string {
        return "Hello World WEEE"
    }
}