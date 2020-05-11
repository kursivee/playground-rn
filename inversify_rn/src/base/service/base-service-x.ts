export default interface BaseServiceX {
    foo(): string
}

export const Symbols = {
    BaseServiceX: Symbol.for("BaseServiceX")
}
