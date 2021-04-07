# OrdersApp

## Project Hierarchy:
/complete/src/main/java/com/example/springboot:
1. OrdersController.java: Using the @RequestMapping annotation in order to defie the API routes.
2. dao: This folder contains the interfaces for our DAO(Data Access Object) of the project.
3. dao/impl: Here are the implementations of the DAO objects and DB interaction.
4. model: Model objects.
5. service: the services interfaces and implementation in the impl folder. In the implementation we use the @Transactional annotation. Where not specified else REQUIRED is the default for propogation, and DEFAULT for isolation level which means the default isolation of our RDBMS, here READ_COMMITTED for Postgres.

## The @Transactional Annotation
We can annotate a bean with @Transactional either at the class or method level, in this project annotated in method level in order to define each method differently.
The annotation supports further configuration as well:
1. the Propagation Type of the transaction
2. the Isolation Level of the transaction
3. a Timeout for the operation wrapped by the transaction
4. a readOnly flag – a hint for the persistence provider that the transaction should be read only
5. the Rollback rules for the transaction
Note that by default, rollback happens for runtime, unchecked exceptions only. The checked exception does not trigger a rollback of the transaction. We can, of course, configure this behavior with the rollbackFor and noRollbackFor annotation parameters.
