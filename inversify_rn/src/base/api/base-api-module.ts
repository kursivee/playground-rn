import { ContainerModule, interfaces } from 'inversify'
import BaseApiX, { Symbols } from './base-api-x'
import BaseApiXImpl from './base-api-x-impl'

export default new ContainerModule(
    (
        bind: interfaces.Bind
    ) => {
        bind<BaseApiX>(Symbols.BaseApiX).to(BaseApiXImpl).inSingletonScope()
    }
)