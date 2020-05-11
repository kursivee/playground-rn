export default interface BaseApiX {
    foo(): string
}

export const Symbols = {
    BaseApiX: Symbol.for("BaseApiX")
}