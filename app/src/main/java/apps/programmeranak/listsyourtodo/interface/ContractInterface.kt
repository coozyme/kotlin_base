package apps.programmeranak.listsyourtodo.`interface`

interface ContractInterface {

    interface View{
        fun initView()
        fun UpdateView()
    }

    interface Presenter {
        fun incremenetValue()
        fun getCount():String
    }

    interface Model{
        fun getCounter(): Int
        fun IncrementCounter()
    }
}