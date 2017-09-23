# Simple framework
Simple framework which runs methods on objects in specified order.

## Usage
* Create object from framework.

        FunctionsCollection functions = new FunctionsCollection(object);

* Add methods into collection

        functions.addFunction("functionName");

* Run all operations in order

        functions.runAll();

* First method is called on given object. Other methods are called on previous returned object.
* Method cannot have parameters.

* Delete method from collection

        functions.deleteFunction("functionName");
        
* Start operations over

        functions.reinitialize();
        functions.runAll();