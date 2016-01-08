import ratpack.groovy.handling.GroovyChainAction
import ratpack.jackson.Jackson

/**
 * Created by Lukas on 31-12-2015.
 */
class TestRestEndpoint extends GroovyChainAction {
    @Override
    void execute() {
        get {
            render(Jackson.json(new Foo(FooName: "nothingFoo")))
        }
        get("foo") {
            render(Jackson.json(new Foo(FooName: "somethingFoo")))
        }
    }
}
