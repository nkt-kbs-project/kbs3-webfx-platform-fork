// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.substitution.var.env {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.console;
    requires webfx.platform.substitution.var;

    // Exported packages
    exports dev.webfx.platform.substitution.var.spi.impl.env;

    // Provided services
    provides dev.webfx.platform.substitution.var.spi.VariablesResolver with dev.webfx.platform.substitution.var.spi.impl.env.EnvironmentVariablesResolver;

}