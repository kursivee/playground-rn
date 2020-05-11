import BaseApiX from "./base-api-x";
import { injectable } from "inversify";

@injectable()
export default class BaseApiXImpl implements BaseApiX {
    foo(): string {
        return "BaseApiX Foo"
    }    
}