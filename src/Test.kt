
fun main() {
    DownloadProdManager().start()
    DownloadTestManager().start()
}
class DownloadProdManager : Thread() {
    override fun run() {
        ConfigController.load()
    }
}
class DownloadTestManager : Thread() {
    override fun run() {
        ImagesController.load()
    }
}
object ConfigController {
    @Synchronized
    fun load() {
        Thread.sleep(3000)
        println("Success ConfigController")
        ImagesController.load()
        println("Конфиг загрузился успешно!")
    }
}
object ImagesController {
    @Synchronized
    fun load() {
        Thread.sleep(3000)
        println("Success ImagesController")
        println("Изображения загрузились успешно!")
    }
}