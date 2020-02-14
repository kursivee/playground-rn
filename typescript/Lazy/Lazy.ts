/* 
 * Utiltiy class for lazy loading
 * Explicitly define lazy parameter type but must call `.value`
 * Example:
 * 
 * const x = new Lazy<String>(() => { return "" })
 */

export default class Lazy<Value> {
    private _value: Value | null = null
    private initializer: () => Value
  
    constructor(initializer: () => Value) {
      this.initializer = initializer
    }
    
    get value(): Value { 
      if(!this._value) {
        this._value = this.initializer()
      }
      return this._value
    }
}