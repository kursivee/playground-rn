interface Object {
    also<T>(lambda: (t: T) => void): T
    kApply<T>(this: T, fn: Function): T
}

Object.prototype.also = function<T>(lambda: (t: T) => void): T {
    lambda(this as T)
    return this as T
}

Object.prototype.kApply = function<T>(fn: Function): T {
    fn.apply(this, fn)
    return this as T
}

class Foo {
    foo!: string
}

const foo2: Foo = new Foo().also((it) => {
    console.log(`${it.foo == undefined}`)
})

new Foo().also<Foo>((it) => {
    console.log(`${it.foo == undefined}`)
})

const fooApply = new Foo().kApply(function(this: Foo) {
    this.foo = "hello"
})
console.log(fooApply.foo)
