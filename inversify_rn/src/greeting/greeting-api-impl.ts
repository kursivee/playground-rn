import { injectable } from "inversify";
import GreetingApi from "./greeting-api";

@injectable()
export default class GreetingApiImpl implements GreetingApi {
    getGreeting(): string {
        return "Hello World!!!!!"
    }

}