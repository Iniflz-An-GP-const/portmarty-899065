package archive.portmarty.connect

import android.app.Application
import archive.portmarty.connect.di.dataModule
import archive.portmarty.connect.di.dispatcherModule
import archive.portmarty.connect.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class AVMCTApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@AVMCTApplication)
            modules(appModules)
        }
    }
}
