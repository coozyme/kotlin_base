package apps.programmeranak.listsyourtodo.presenter

import apps.programmeranak.listsyourtodo.Model.MainActivityModel
import apps.programmeranak.listsyourtodo.`interface`.ContractInterface

class MainActivityPresenter(_view : ContractInterface.View) : ContractInterface{
    private var view : ContractInterface.View = _view
    private var model : ContractInterface.Model = MainActivityModel()


    init {
        view.initView()
    }

    fun incrementvalue(){
        model.IncrementCounter()
        view.UpdateView()
    }

   fun getCount () = model.getCounter().toString()

}