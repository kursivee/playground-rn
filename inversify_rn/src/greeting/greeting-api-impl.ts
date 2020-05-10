import { injectable } from "inversify";
import GreetingApi from "./greeting-api";

@injectable()
export default class GreetingApiImpl implements GreetingApi {
    constructor() {        
        console.log("init Greeting ApiImpl")
    }
    getGreeting(): string {
        return "Hello World!!!!!"
    }

}