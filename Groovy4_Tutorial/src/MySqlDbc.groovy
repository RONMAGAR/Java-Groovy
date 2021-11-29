import groovy.sql.GroovyResultSet
import groovy.sql.Sql as Sql
class MySqlDbc {
    static void main(String[] args) {
        def sqlobj = Sql.newInstance(
                user:"root",
                 password : 'Admin@123',
                driverClassName :'com.mysql.cj.jdbc.Driver',
                 url : 'jdbc:mysql://localhost:3306/groovy_db')

        def query = "insert into person values(102,'tony',23456)"
        //sqlobj.execute(query)
        sqlobj.eachRow("select * from person"){
            row->
                GroovyResultSet res = row
                println(res.getInt(1))
                println(res.getString('pname'))
                println(res.getDouble(3))
        }


        sqlobj.close()
//        close

    }


}
