interface Service {
    hello(): string
 }
 
 interface Logger {
     log(s: string): void
 }
 
 class FooService implements Service {
     hello(): string {
         return "Hello World"
     }
 }
 
 class FooLogger implements Logger {
     log(s: string) {
         console.log(`Logging ${s}`)
     } 
 }
 
 class ConstructorInjectable {
     private logger: Logger
     private service: Service
 
     constructor(logger: Logger, service: Service) {
         this.logger = logger
         this.service = service
 
         this.logger.log("Injected ConstructorInjectable")
         console.log(this.service.hello())
     }
 }
 
 class FieldInjectable {
     // Note to self `fieldName!` == `lateinit fieldName`
     logger!: Logger
     service!: Service
 
     // Simiulate react native mounting
     onComponentDidMount() {
        applicationContext.inject(this)
        this.logger.log("Injected FieldInjectable")
        console.log(myFieldInjectable.service.hello())
     }
 }
 
 class Context {
     logger: Logger = new FooLogger()
     service: Service = new FooService()
     constructorInjectable: ConstructorInjectable
 
     constructor() {
         this.constructorInjectable = new ConstructorInjectable(this.logger, this.service)
     }
 
     inject(fieldInjectable: FieldInjectable) {
         fieldInjectable.logger = this.logger
         fieldInjectable.service = this.service
     }
 }
 
 // Mock a "Application State"
 const applicationContext = new Context()
 
 const myFieldInjectable = new FieldInjectable()
 myFieldInjectable.onComponentDidMount()
 
