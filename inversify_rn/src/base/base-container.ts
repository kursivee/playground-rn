import 'reflect-metadata'
import { Container } from 'inversify'
import BaseServiceModule from './service/base-service-module'
import BaseControllerModule from './api/base-api-module'

const container = new Container()
container.load(BaseServiceModule, BaseControllerModule)
export default container