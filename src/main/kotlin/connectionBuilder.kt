import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

open class ConnectionBuilder {
    // TODO Auto-generated catch block
    lateinit var connection: Connection

    private val jdbcURL = "jdbc:h2:mem:example"
    private val jdbcUsername = ""
    private val jdbcPassword = ""

    init {
        try {
            // Aqui construimos la conexión
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)
        } catch (e: SQLException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
    }


}