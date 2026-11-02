package archive.portmarty.connect.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import archive.portmarty.connect.data.database.dao.CartItemDao
import archive.portmarty.connect.data.database.dao.OrderDao
import archive.portmarty.connect.data.database.converter.Converters
import archive.portmarty.connect.data.entity.CartItemEntity
import archive.portmarty.connect.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AVMCTAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}