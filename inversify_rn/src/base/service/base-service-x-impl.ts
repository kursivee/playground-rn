import BaseServiceX from "./base-service-x";
import { injectable } from "inversify";

@injectable()
export default class BaseServiceXImpl implements BaseServiceX {
    foo(): string {
        return "BaseServiceX Foo"
    }    
}