import { injectable, inject } from "inversify";
import GreetingApi from "./greeting-api";
import BaseApiX, { Symbols } from '../base/api/base-api-x'

@injectable()
export default class GreetingApiImpl implements GreetingApi {
    private _baseApiX: BaseApiX

    constructor(@inject(Symbols.BaseApiX) baseApiX: BaseApiX) {        
        console.log("init Greeting ApiImpl")
        this._baseApiX = baseApiX
    }
    getGreeting(): string {
        return `Hello World ${this._baseApiX.foo()}`
    }
}