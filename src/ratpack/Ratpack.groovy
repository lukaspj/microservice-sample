import ratpack.groovy.template.MarkupTemplateModule

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
    bindings {
        module MarkupTemplateModule
        module TestModule
    }

    handlers {
        get {
            render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
        }
        get("test") {
            all chain(registry.get(TestRestEndpoint))
        }

        files { dir "public" }
    }
}
