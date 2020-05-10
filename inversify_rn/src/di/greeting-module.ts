import baseContainer from './base-container'
import GreetingService, { Types } from '../greeting/greeting-service'
import GreetingServiceImpl from '../greeting/greeting-service-impl'

baseContainer.bind<GreetingService>(Types.Greeting).to(GreetingServiceImpl)