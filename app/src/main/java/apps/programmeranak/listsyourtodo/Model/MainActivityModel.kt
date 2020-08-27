package apps.programmeranak.listsyourtodo.Model
import apps.programmeranak.listsyourtodo.`interface`.ContractInterface

class MainActivityModel: ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun IncrementCounter() {
        mCounter++
    }
}