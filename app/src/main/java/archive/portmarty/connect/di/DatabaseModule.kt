package archive.portmarty.connect.di

import androidx.room.Room
import archive.portmarty.connect.data.database.AVMCTAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "avmct_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = AVMCTAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<AVMCTAppDatabase>().cartItemDao() }

    single { get<AVMCTAppDatabase>().orderDao() }
}