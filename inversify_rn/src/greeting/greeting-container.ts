import baseContainer from '../base/base-container'
import GreetingService, { Types } from './greeting-service'
import GreetingServiceImpl from './greeting-service-impl'
import GreetingApi, { Symbols } from './greeting-api'
import GreetingApiImpl from './greeting-api-impl'
import { Container } from 'inversify'

const greetingContainer: Container = new Container()
greetingContainer.parent = baseContainer
greetingContainer.bind<GreetingService>(Types.Greeting).to(GreetingServiceImpl).inSingletonScope()
greetingContainer.bind<GreetingApi>(Symbols.GreetingApi).to(GreetingApiImpl).inSingletonScope()

export default greetingContainer