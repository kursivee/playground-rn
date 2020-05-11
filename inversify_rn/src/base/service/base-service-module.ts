import { ContainerModule, interfaces } from 'inversify'
import BaseService, { Symbols } from './base-service-x'
import BaseServiceXImpl from './base-service-x-impl'

export default new ContainerModule(
    (
        bind: interfaces.Bind
    ) => {
        bind<BaseService>(Symbols.BaseServiceX).to(BaseServiceXImpl).inSingletonScope()
    }
)