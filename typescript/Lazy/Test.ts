import Lazy from './Lazy'

class Service {
    foo() {
        console.log("bar")
    }
}

class Context {
    private _serviceA = new Lazy<Service>(() => {
        console.log("Initializing service A")
        return new Service()
    })

    get serviceA(): Service {
        return this._serviceA.value
    }
}
  
const context = new Context()
console.log("Initialize service A has not been called yet")
context.serviceA.foo()
console.log("Should not reinitialize A")
context.serviceA.foo()