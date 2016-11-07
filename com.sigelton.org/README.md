Sigelton Design Pattern!
===================


Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
----------

#### <i class="icon-file"></i> Implementation

In this Java Tutorial we will go over all detailed steps required for you to use Singleton pattern in your Enterprise Project. We use Singleton object to push required data at runtime and we use the same Singleton object to retrieve data at runtime. You could access Singleton object from anywhere.
----------


// Cool Class Diagram
[Customer|-forname:string;surname:string|doShiz()]<>-orders*>[Order]
[Order]++-0..*>[LineItem]
[Order]-[note:Aggregate root{bg:wheat}]