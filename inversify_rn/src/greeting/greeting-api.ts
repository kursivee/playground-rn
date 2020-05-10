export default interface GreetingApi {
    getGreeting(): string
}

export const Symbols = {
    GreetingApi: Symbol.for("GreetingApi")
}