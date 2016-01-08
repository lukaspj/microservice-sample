import com.google.inject.AbstractModule
import com.google.inject.Scopes

/**
 * Created by Lukas on 31-12-2015.
 */
class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestRestEndpoint).in(Scopes.SINGLETON)
    }
}
