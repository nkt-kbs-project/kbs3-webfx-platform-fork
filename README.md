# The WebFX Platform

The WebFX Platform is the foundation layer & API for cross-platform development with [WebFX](https://github.com/webfx-project/webfx).

<div align="center">
  <img src="https://docs.webfx.dev/webfx-platform/webfx-platform.svg" />

<p></p>

| Modules set        | Location | Description                                                                |
|--------------------|----------|----------------------------------------------------------------------------|
| **UIScheduler**    | Client   | Cross-platform API for scheduling UI tasks (mono thread)                   |
| **Storage**        | Client   | Cross-platform API for client-side storage (LocalStorage & SessionStorage) |
| **WindowHistory**  | Client   | Cross-platform API for accessing the window history                        |
| **WindowLocation** | Client   | Cross-platform API for accessing the window location                       |
| **WebAssembly**    | Client   | Cross-platform API for working with WebAssembly                            |
| **WebWorker**      | Client   | Cross-platform API for working with web workers                            |
| **Resources**      | Shared   | Cross-platform API for accessing resources files                           |
| **Console**        | Shared   | Cross-platform API for logging in the console                              |
| **Boot**           | Shared   | Cross-platform entry point for all WebFX applications                      |
| **Shutdown**       | Shared   | Cross-platform API for shutting down WebFX applications                    |
| **Scheduler**      | Shared   | Cross-platform API for scheduling non-UI tasks                             |
| **Json**           | Shared   | Cross-platform Json API                                                    |
| **Async**          | Shared   | Future & Promise API for async operations                                  |
| **File**           | Shared   | Cross-platform API for accessing local files                               |
| **Vert.x** *       | Server   | Implementation of the server-side modules for [Vert.x](https://vertx.io)   |

*\* An additional implementation for Spring Boot might be considered in the future*.

</div>

## Status

All modules are implemented, but still need to be documented (website & Javadoc).

## License

The WebFX Platform is a free, open-source software licensed under the [Apache License 2.0](LICENSE)
