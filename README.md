                 Kotlin 
                 
                 No need to declaire constructor additionally use class name for constructor and use that.
                 Read Eval Print Loop to execute the code part sepratelly using this tool very fast and to know is that code running bug free.
                 Data types in kotlin all are objects
                   Data types    every first letter is Capital in Kotlin
                   
                      =========>>     Boolean                1 bit
                 	                  Byte                   8 bit
                 					  Char                   16 bit
                 					  Short                  16 bit
                 					  Int                    32 bit 
                 					  Long                   64 bit
                 					  Float                  32 bit
                 					  Double                 64 bit
                 					  
                 					  
                 					  All DataType must be initialized in case of Kotlin
                 					  
                 	Range is defined in double dot like this 1..6 means 1,2,3,4,5,64
                 	
                 	you can change any function into expression kotlin unlike java
                 	
                    Interoperability  its mean in Kotlin is that you can call a java function from Kotlin and Kotlin function from java.
                                      you can have java and Kotlin files in the same project...
                 
                   in case of java ============>
                   How java code run actually it  first compile the .java file and convert it into byte code and this byte code into .class file
                   this is called compilation that is also called compile time,, handled by jdk that contains comiler 
                  
                 
                  this byte form code is more readable by java virtual machine this prcess is called runtime ..
                   
                 in case of Kotlin ==========>
                  
                  in the time of comile time we jave .kt class and compiler convert it into byte code and saved as kt.class 
                  now bytecode is ready to run with the help of java virual machine as well.
                  
                  
                  Runs every where the jvm can run
                  Statically typed
                  object oriented
                  functional programming
                  
                  
                  ===>  guiding principles are
                  1. conscieness
                  2. safety
                  3. pragmatism
                  4. Interoperability
                  
                  
                  Java doesn't support default function but same is support by Kotlin.... but in case of using default function with in the java we must have to use 
                  @JvmOverloads   to use the interoperability of default function..
                  
                  Named parameter is very funtustic feature in kotlin but not in java.....
                  no need to pay attention on sequence passing value in the function parameter..
                  
                  Add new  extenstion function to the classes
                  
                  1. can add function to the class without declaire it 
                  2. new function added behaves like the staic.
                  3. They can become the part of your own class.
                  4.  e.g student , employe etc..
                  5. They can become the part of System classes i.e String,Int, Array. 
                  
                  benefits of extension function is ===> reduces code
                                                    ===> Code is much cleaner and easy to use as well as read
                 									
   								
   Infix Funciton == > 
                     Infix Funciton can be  a  member function or extension Funciton
   				  They have single parameter
   				  they have prefix of Infix.
   				  
   				  All Infix Funciton are always extension Funciton
   				  but all extension Funciton are not infix Funciton
   
   
   Recursive Function ===>  also called tail rec Function
                            Uses recursion in more optimised way comparativelly other language
   					   it prevents stack overflow Exception without effecting the stack memory
   					   prefix of tailrec is used 
                          
   
   
   Class in Kotlin with
   
                       Primary constructor  ====> 
   
                        1. Property callled field variables in Java
   			       2. init Block
   			       3. Primary constructor with init Block
   			       4. Primary constructor with just parameters
   
                       Secondary constructor  ====> 
   
                        1.We can not also declare property in the secondary constructor remember it
   				   2.We must have called the primary constructor property
   				   3.we must first call to
                                        primary constructor as mention in the secondary constructor using
                                        this keyword with name of primary constructor property using colon in heading of secondary
    
   				  
					  
					  
					  

   Classes with Inheritacne in kotlin  ======>
    
                    1. By default classes are final and public
   				 2. For inheritance we need to make a class open.
      
   				   
   
   
   
      Function Overriding	  ======>
   
                                  discussed and written in the classes and peoject only 
   							   
   							   
   							   
   Access Modifiers     ========>
   
                           1.public          in kotlin all field , function, classes are final and public
                           2.protected
                           3.internal
                           4.private
   
   
   					 
   Abstract Method Function and Property   ======>
                                                    
                                                     1. Classes can be Abstract in nature
                                                     2. The role of Abstract Class is to be just provide the set of method and Property
                                                     3. Abstract classes are partially defined classes
                                                     4. Abstract method have no body when declare
                                                     5. Abstract body can not be initialised when declared in Kotlin
   											   
   											   
 			 Conclusion  ===>   
 			           1. You can not create instance or obejct of the abstract class otherwise cimpiler will not happy
 					   2. You need to override abstract methods , properties inside derived Class
 								   
 								   
        														   
        Interface =======>  
                                           
                    1. Interface can contain both ormal and Abstract Method
                    2. but they contain only abstract property 
                    3. interfaces are not classes 
                    4. you can not create instance of interface...
        
           
        
     Data Classes and Super Classes "Any	
        
     ==========>
                  1. Any classes contains functions such as equals(), hashcode(), toString()  Method	 every class have these method by default
                  2. Kotlin create a copy() method too
              	  3. Now Data Classes simply provides these metnioned methods implimentation
    	           constructor of data classes contain only paoperty parameter not the parameter with their declaration that val or var etc
    	
	
	
 
            object Declaration and Companian Object	==========>
                                                   
                                                    Singlton when we have just one instance of class in the whole application that is called Singlton Class that
         										Kotlin creats it autmatically internally , we have no control on it...
         
                                                    if a class Student is declared Singlton then we can not create the other instance of this class 
                                                    there exist only one instance for this class by default...
         
                                                    in Kotlin we can not declare static variables and method so we have an alternative to that 
                                                     Declare object
                                                      this create a singlton object  when program runs   
                                                    
         										when we use keyword 'object'
         										. kotlin internally, creates a class and an object/instance 
         										These objects can have property , method, initializer due to initializer we can use init {} block for our own code to play
         										can not have constructot as we can not create object manually
         										object can have a super class
         										that support inheritance 
         										
         										Companian object are same as like simple object but declared with in  a class when we use the companian keyword in the singleton class 
         										object then this class fields and variable and method behaves like static method and field values 
         
         
             Kotlin   Enums in Kotlin ============>
                                        what is the purpose of ENUMS in Kotlin
                                        1. These are basically used to store the constant value 
         							2. Enum constants are obejct of Enum class typed
         							4. there are two parameter in it that name and ordinal 
         							5. each Enum obejct have two method that is values and valueOf	
         							6. we can also add more property by using constructor in the enum 
         							7. we can implement the interface in the enum also implement override method by their constant properties but not abstract classes or open classes
         							8. Enum constant can be use as Annonymous class by using abstract Method
         							
         							Summary of enum
         							when you have finite number of constant values you can group them together in an enum Class
         							enum object are constant value , once you create them , it can not be changed
         							each enum constant is a seprate instance of the enum class , They have properties of name and ordinal and methods of value and valueOf
         							You can assign your properties to each enum object by using a constructor 
         							you can use enum classes as Annonymous classes ...
         							
         							
         Sealed class in Kotlin =========>
                                    
                                        1. In it the constant value can be dynamic that is the difference. 
                                        2. sub classess of sealed class on be defined with in the same class where the parent sealed class declared. 
                                        3. sub classes can be data class, regular class, object class, another sealed class, also sealed interface in the sealed classes. 
                                        4. also the object declaration with in the sealed class. 
                                        5. "When" is alos used in both enum and sealed classes.
         							6. Sealed class can not be instantiated cause it is abstract in nature.
         
         
            High Level funtions and Lambdas  ===========>  make notes later
                   
                                        	   
         							
         							
         							
         							
         							
         							
         							
         Kotlin Coroutines	===================>    make notes later						
         							
         							
         							
         							
         							
         							
         							
         							
         							
         Kotlin Collections     =========>      Collections List 
                                                      
         										  ===> Immutable Collection that is read only Operation
         											   1. Immuatable List : listOf
         											   2. Immuatable Map : mapOf
         											   3. Immuatable Set : setOf
         											   
         										  ===> Immutable Collection that is read & write both Operation
         											   1. Mutable List : ArrayList, arrayListOf, mutableListOf
         											   2. Mutable Map : HashMap, hashMapOf, MutableMapOf
         											   3. Mutable Set : HashSet, hashSetOf, mutableSetOf
				   
				   
				   
				   
				   
				   
    	ViewModel	==================>      prepare notes later								   
				   
				   
				   
				   
				   
												   
												   
												   
	Customize View Model ===========>       we will use viewmodelfactory class when we need to make customized viewmodel with constructor parameter, to do that we need a new factory 
                                            class which extends ViewModelProvider.Factory we can always use this boiler plate code by changing the name of the view model and parameters
                                            , Now in the activity we need create the instance of it(ViewModelFactoryClass) and pass it as the second argument of ViewModelProvider of
											function...
 											
											
	Live Data ======================>    There is a better way to get the data instead of invoking the particular funciton as explain above in view model, here is the Live Data comes
                                         into the picture so if any chagne or update comes in data from local or cloud we can write code to observe this change in the view model as well
										 as update this data on UI(Activity & Interface) from the acitivty and fragment using Live Data...

                                         Live Data is a life cycle aware observable data holder class.
										 Activity, Services, Fragment can be used as observers of LiveData Objects.
										 Live data only update observers in an active life cycle state.
										 
										 When we are using Rx Java to avoid errors , we have to carefully write codes to dispose observers when Activity, Fragment and  Services 
										 become inactive ,But with LiveData we don't have to worry about that 
										 so what are the benefits of using live data 
										 1. LiveData automatically updates the UI when app data chagnes  there for with live data we will always up to date, with live data we don't 
										 need to write codes to handle lifecycle manually, 
										 2. Since live data always aware of lifecycle status changes they  clean up themself when 
										 their associated life cycle destroyed.
										 3. Therefore No memory leaks or crashes will happen as a result of destroyed Activity or Fragment.
										 4. We can also use live data to share our app  Services between different component of application.
										 
						Mutable LiveData ========>   it allows us to change and update the data but LiveData doesn't.			 
										 
										 
										 
	
    Integration Data Binding and View Model Directly  ==========>    we will use listener Bindings for the button to invoke ViewModel's updateCount() function.
	                                                                 we will also learn how to use LiveData as a data binding source, in that way we will be able to 
																	 use LiveData Directly in the xml layout without writing codes to observe them in the activity or 
																	 fragment 
																	 
																	 To connect the view model object with data binding object add the view model as data binding variable in the 
																	 activity or fragment layout file.
																	 After add this data binding variable object in layout file go to the controller activity of this xml file and 
																	 assign the dataBinding.myViewmodel object we created there with the controller viewModel object , after assinged
                                                                     we  will use listener binding for the onClick() event so go back to layout file 																 
	
	
	
	
	
	
	 Now we will work on How to use LiveData Directly with dataBinding ========>    
	                                                                in BasicCounterUpdate app --->
                                                                    Now we are going to remove the observer part code of live data in main activity instead of it 
                                                                    we have to use livedata as databinding source for the databindng object in the xml layout file.
																	for the text view i am going to use count value LiveData Value 
																	in the textview 
																	andoid:text="@{String.valueOf(myViewModel.count)}"     // using stirng here for int cause to set value of int in string for textview
                                                                    Live Data is always associated with the lifecycle of Activity,fragment,Services		
                                                                    so we have to provide the actual life cycle owner to the view model object ,
                                                                    , in the main Activity we need to set the current acitivty as the lifecycle owner of the Binding obejct
																	viewModelBinding.lifeCycleOwner = this
																	so now we dont need the observer part any more
																	
																	Now we want to provide more security to our data if we want to encapsulate our data , make private 
																	MutableLiveData<Int>() Object variable
																	
																	
																	
																	
																	
																	
	Two Way Data Binding =========================================>
                                                                   Here we will be able to write codes to change the values of associated Object when the value of UI changes
                                                                   , with two way data binding when the value of object changes, the UI changes, When the value of UI changes   
                                                                   the value in the object changes,, how amazing it is. changes update automatically two both always
                                                                   
																   // implementation
                                                                    Make the same data binding object 
                                                                    we need to assign the constructed ViewModelActivity object to the viewModelXML object we have defined for layout in 
																	<data><variable> tags in xml file
																	
																	
																	       // now if we run this app it shows the initial user name we have assigned here in the view model
                                                                    init block on the textview
	                                                             
                                                                    till yet we have using one way data binding here we have Bound some views to the object(ViewModel)
                                                                    Bound views are displaying the values of properties of the object
	                                                             
                                                                    now for two way data binding
                                                                    Adding a new Edit Text to the view and let us see  what happened if we bind the same user name live data to this edit text
                                                                    in the activity_main.xml File
	                                                             
                                                                    Here on the run of this application data is same in both text field and text view
                                                                    but when to change the value in text field text view is not updated cause
                                                                    in one way data binding allows us to update the UI from the bound object but
                                                                    it doesn't allow us to update the bound object from the UI(layout),
	                                                             
                                                                    for two way data binding we just need to assign the same view model property to view where we want to use the same value to be updated
                                                                    here we have one edit text and second is text view so we do what is the same as write in just above line as well as use "=" expression
                                                                    android:text="@={viewModel.userName}" in the view item with which we accordingly we want to update the second view item and the result
                                                                    on Run is as we required...
																	
																	
														
																	
																	
	When do we use Two Way Data Binding ?  =====================>																
																	we can use one way data binding to show the user some data (app to user data flow).
                                                                    We can also use one way data binding to get user input(user to app data flow) .
                                                                    If, for some reason, we want to both show data and get user input over the same widget,
                                                                    in other words, if we need a two-way data flow, we should use two-way data binding .
                                                                    As an example in section 9 project example I have used two way data binding for an EditText
                                                                     																	
																																		
																																		
																																		
																																		
																																		
	Navigation component Architecture  =========================>   There are 3 main parts of a Navigation component.
                                                                    1. Navigation Graph    --->  it is an XML resource file that contains all navigation related information, allows us to manange Navigation related tasks from a single location 
                                                                    2. NavHostFrgment      --->  it is an Empty Container keep it on the Activity to hold the "Navigation Graph" (fragments and other UI component).   
                                                                    3. NavController       ---> it is a class generated by the Navigation Library to manage the navigation between desitnations we added to the navigation graph.
																	
																	we will learn all the navigation architecture component one by one
																	
																	Add dependencies and remember when we are using navigation architectue component to pass data between fragments,
																	we need to use "safe args", To add safe args to our project, copy paste from official website this class path
																	in out top level gradle.build File as well as add safe args plugin in the app level gradle.build File
																	  
																	we can use Navigation without Data binding but we are must be the habitual of using Data binding so i am using in it.
                                                                    different fragment in the navigation graph are callled navigation destination...
																	


                                                                    Transforming Data between Destinations 
																	1. we are going to get user input as a bundle val bundle
																	2. we edit the bundle as an argument
																	3. also add null safety check where it is required
																	
																	
																	Animation between Destinations
																	using connector link  between the destination we have shown Animation option in the Nav_grapgh.xml file 
																	choose here animation according to your choice...
																	in android animation always written in xml files so we need to add animation resource file to our project.
																	pop enter and pop exit animation are work on back button press...
    																	
																	

    

         Recycler View    ========================>     fundamentals  
		                                                          1. we need to set recycler view layout manager.   linear layout manager, Grid layout manager, StaggeredGrid layout manager
                                                                  2. most of the time we have use Linear Layout Manager...
                                                                  3. also have recycler view library to create own custom recycler layout Manager. and then initialise the layout manager
                                                                  4. After setting layout manager we need to set the adapter instance for recycler view 
                                                                  5. Adapter class should be the sub class of RecyclerView's Adapter class., create new kotlin class for Adapter
                                                                  6. Adapter class have 3 main functions as well as Adapter's parent class type will a type of ViewHolder class 
                                                                  7. onCreateViewHolder(), onBindViewHolder(), getItemCount must be implement in the class...
                                                                  8. getItemCount() return total number of items in the set held by Adapter
                                                                  9. RecyclerView Library will create number of spots for list items considering that return value.
                                                                 10. in the on create view holder this is where we create the list item 



        Co -Routines   ========================== >     
                                                    Why we need asynchronous programming :-  App refreshes itself 60 times in 1000 ms means refresh frequency rate is 60hz /second
                                                    To perform task on the android main thread 
                                                    we should always implement long running tasks asynchronously in a seprate thread...													
													
													To do the long running task asynchronously we have very fast and furious option that is Kotlin Co Routines
													
													we have scope , dispatchers, & builders => Scope is like an interface which defines the scope of co routine so coroutine can work 
													                                           efficientlly, and these scopes also acts as a reference to the coroutine context..
                                                                                               i.e  Dispatcher.IO can work as the coroutine context
                                                    if we want to use an exolicit job instance , we can include the name of the Job instance plus a Dispatcher  . i.e Dispatcher.IO + job
                                                   we have Dispatcher category   ==>  Dispatcher.Main =====> in this case coroutine will run in the main thread or UI thread, 
													                                                        use it for light weight,small tasks like to a UI function or to get update 
																											from live data in structured con currency is the best practice
													
                                                                                    Dispatcher.IO  ======>  The co routine will run in the back ground thread from a shared pool of on-demand created thread.
																					                        use it to work with local data base, communicate with network, work with files ...
																											
																				Dispatcher.Default ======>  Default dispatcher is used for cpu intesive tasks. such as sorting a list. or parsing a huge json file
                                                                                                            with details of 100000 movies detail like that. 																				
																				                              
													                     Dispatcher.Uncomfirmed   =======>  This dispatcher is used with Global scope, Coroutine will run on the current thread
                                                                                                            but if it suspended and resumed it will run suspended function's thread 
                                                                                                            it is not recommeded to use this Dispatcher in the android development.


                                                    Apart from these 4 dispatcher coroutine api also facilities us to convert executors in to dispatcher...as well as to create our own 
                                                    custom dispatcher, creators of libraies like room , retrofit have bee using there own custom dispatcher to execute operation in the
                                                    back ground thead there fore we should learn when we use retrofit and room libraries.


                                                                                            // This dispatcher.IO is used with coroutine to shift
                                                   //  this long running task to a separate back ground thread.
                                                   // this launch keyword is a coroutine builder, these are the
                                                   // extension of coroutine which is used to launch new co routine
                                                   // there are 4 main co routine builder
												   
												   
                                                   // Launch  ==> launching a new coroutine with out blocking the main or current thread, returns an instance of job ,
                                                                // which can be used as a reference to the co routine , we use this builder for the co routine which
                                                                // does not have any computational result as the return value but we can use that return job instance to keep track
                                                                // of the co routine & to cancel the coroutine, can not use this coroutine launch to calculate something and get the
                                                                // final answer as the returned value...
	                                       
	                                       
                                                   // Async  ==> for return value type result we have to use async coroutine builder, it allows us to launch co routines in parallel
                                                                 // it also launch the coroutine without blocking the main thread it returns an instance of deffered of type of result
                                                                 // actually deffered interface is an extension of Job interface, we can also use it like a job as cnacelling the
                                                                 // coroutine , we use this builder for corotuine that returns some result value,
                                                                 // to get the value from deffered object we need to invokes its await() function. launch and Async are commonly used
                                                                //  builder
	                                       
	                                       
                                                  // Produce ==>  this builder is used to coroutine which produces a stream of elements return an instance of receivechannel.
	                                       
	                                       
                                                  // RunBlocking ==>  in android development we use the co routine we create using this thread will block the thread untill co routine is
                                                                     // executing. This is mostly use for testing purpose and returns a result which can be directlly use.
	                                       
	                                       
                                                   // Structured Concurrency ===> it is set of language feature and best practice introduces for kotlin Coroutine to avoid leaks and to manage
                                                   //                             them productively

 													
																					   
																					   
																					   
																					   
		Kotlin Suspended Funciton 	==============>    
                                                    In Kotlin when a coroutine is suspended , the stack frame of the Funciton is copied and save in the memory..
                                                    When the Funciton completing its task the stack frame is copied back from where it was saved and start running again .
                                                     kotlinCoroutine api provides us a lot of funcitons to make our work easier the suspending Function are as follow
                                                    =>  withContext()
                                                    =>  withTimeout()
													=>  withTimeoutOrNull()
													=>  join()								   
													=>  delay()								   
													=>  await()								   
													=>  supervisorScope()								   
													=>  coroutineScope()	there are many suspended Funciton provide by Kotlin api
													=>  Retrofit and Room library also have suspended function 
													we actualy limiting the use of function where we use suspend and limit them to use only with corutine  it also called a corutine 
													Block
													can not suspended Funciton from normal funciton or form other places  using suspend modifier labeled the function as a long running task
													co routine can invoke both suspended and normal function
																					   
																					   
																					   
													
													How Suspending Functions Work
                                                  Let's say we have a function named myFunction.
                                                  
                                                  
                                                  
                                                  fun myFunction(){
                                                  
                                                  Code block 1
                                                  
                                                  Code block 2 //this one has a long running operation
                                                  
                                                  Code block 3
                                                  
                                                  Code block 4
                                                  
                                                  }
                                                  
                                                  
                                                  
                                                  Usually these code blocks execute like block1, block2, block3, block4 . So code block 3 and 4 might execute
												  while code block 2 is still running. (synchronously) Because of that reason there can be problems. (screen might freeze, 
												  app might crash)
                                                  (assume code block 3 is a click event code of a button,..) But if we make this function suspend.
                                                  
                                                  suspend fun MyFunction(){
                                                  
                                                  Code block 1
                                                  Code block 2 //this one has a long running operation
                                                  Code block 3
                                                  Code block 4
                                                  
                                                  }
                                                  
                                                  Now, this function can get paused when code block 2(long running operation) starts executing and get resumed when it is done. Code block 3 and 4 will execute after that. So there will be no unexpected thread sharing issues.
                                                  
                                                  Functions marked with the suspend keyword are transformed at compile time to be made asynchronous under the hood, even though they appear synchronous in the source code.
                                                   
                                                  A suspending function doesn't block a thread, 
                                                  but only suspends the coroutine itself. (one thread can have more coroutines)
                                                  The thread is returned to the pool while the coroutine is waiting,
                                                  and when the waiting is done, the coroutine resumes on a free thread in the pool.
												  
												  
												  
	@ Network Communicator											  
	Retrofit  :-   To use Retrofit  you have to implement these 3 steps.

                   1. To Convert Json data to Kotlin create corresponding Data Classes.
				   2. Create A Service Interface to define functions with URL end points.
				   3. Need to create a Retrofit Instance Class.
				   4. Dependencies for Retrofit, GSON=> this support to retrofit to convert JSON data to java or Kotlin format, 
				   5. add okhttp3.
				      OkHttp is an HTTP client that’s efficient by default:
                             A. HTTP/2 support allows all requests to the same host to share a socket.
                             B. Connection pooling reduces request latency (if HTTP/2 isn’t available).
                             C. Transparent GZIP shrinks download sizes.
                             D. Response caching avoids the network completely for repeat requests.
				 5. Add Coroutine dependencies.
                   we can create the retrofit instance using the Builder function of retrofit Class , we need it to request server.
				   add companian object in this class to make it singleton
				   
				   rest notes in the projects 
				   
				   
				   
				   
	Notification =======>
	                       Simple Notification 
						   Heads - up Notification
						   app icon badge
                           	Reply, Detail, Settng Action button in the notification receivechannel




    Work Manager ==========>  
                            work manager takes gaurantees to do the back ground task evern if we are avay from app or app is closed , before Work Manager 
                            these task had done by Firebase Job Dispatcher, Job Scheduler, Alarm MAnager with Broadcast Receiver...
                            to schedule task and scheduling tasks is very complex and time consuming  process. But Now we have Work manager =>
							All we need to is pass the task to Work Manager , it will decide which scheduler should be use considering the requirement
							and it will take care of constraints , If the device api level is less than 23 work manager will use a combination of 
							Broadcast Receiverand Alarm Manager , if the device api level is 23 or higher work manager will choose Job Scheduler
							if our task uses firebase, Work Manager will choose Firebase Job dispatcher,  Manager offers a lot of advanced feature
							.It supposrt chained task. Work manager provides status update as Live Data..
							1. Chaining task
							2. Status update
							3. constraints
							4. Minimum Resources usage
							5. Support Different Version..
							6. Support asynchronous task
							7. Support periodic task
							
							for normal back ground task we dont need to use work manager there is already co routine and Rx java easily to do that 
							
							There are two type of work request when we use schedule task with work manager 
							1. Periodic Work request.
							2. One time Work request.
							
							
							There are 4 basic steps of scheduling a task using work manager 
							1. Create a Worker Class 
							2. Create a work request 
							3. Enqueue the request
							4. Get the status update 
							
							For each work request, work manager allows us to get a Live Data of type WorkInfo
							WorkInfo type object contains information about the work. By Observing it we can determine the 
							current status & other information about the work ,to observe live data we need work manager 
							instance 
							
							A Work has 4 state 
							1. Blocked   ===>  it occurs only it the work blocked in a chain of works.
							2. Enqueued ===> works enter in to this state as soon as the work is next in the chain of work and eligible to run.
							                 if there is a constriant met, work will have to stay in the enqueued state.  
							3. Running  ===> when a work is activelly executing raunning state
							4. Succeeded  ===> After a work successfully completed , work enters to succeeded state.
							 
						
						 
                            When we are using work manager we need to write codes to run task under different 
							specific condition. so then work manager uses constrint provided by us to decide when the 
							work should run for example oru app has a large video file to upload to the back end server 
							, it is a battery consuming task , in that case we might need to specify, that the task should 
							run only when the device is connected to the charger , let we do it on the IDE android studio
							
							Constraint is very intersting when we use these in our application.
							
							
 How to set INPUT/OUTPUT data ===> with work manager
                                   we might need to pass some argument to a task: to do that we need to create a Data Object
								   and set that Data object to the request object, need to set a constant value tp pass argument
								   to work manager after pass the data same is required to send data from work manager to UI controller
								   need to create a constant in the work manager class so let it do
								   
								   
								   
								   Sequential and parallel work Request  details and coding in the project
								   
								   for Now we will discuss about Periodic Work request
                                   android jetpack periodic work request has minimum period of 15 minute
								   
								   
 Dependency Injection ===>  
                                              The Process of Constructing required dependencies(Object/Entites/Instance) outside of the dependent 
                                              Object & providing them to the dependent object when needed is called Dependency Injection.
											  
						Dagger vs Hilt ===>
						                              Dagger is a supporting library Android developers has been used for dependency injection for many years.
													  Hilt is another  new library created on top of hilt to make coding even more easier.

							                         1. Constructor Injection
													 2. Metond Injection
													 3. Field Injection
													 in Android development Constructor Injection is recommeded as much as possible
													 
													                                      ===>      BATTERY
													 
													 
													 SMART PHONE          ===>      MEMORY CARD
                                    		  
								   
		                                                                                   ===>     SIM CARD    ===>      SERVICE PROVIDER
							 
															Smart Phone indirectlly have service provider Dependencies  in this scenario Dagger can generates code to  construct Dependencies 
															represented by This Dependencies graph. 
															To use dagger  generated codes for Dependency Injection  we also need an interface  annotated with @Component
															annotation , lets create a new interface  
												
												Important => we should try to implement constructor injection for all the classes we own . that means we should go to the class , type 
												                        Inject annotation in front of the consrtuctor like we did in some example that is the easiet and  most efficient way,  but
																		in many practical scenario , we can not modify the class , we are not allowed to open the class and add Inject annotation to the 
																		Constructor, i.e when we are using retrofit client , since retrofit is a third party library we build it using its builder function when we are
																		using the classes from third party libraries , we can not open the class and add @Inject annotation to the Constructor, also there are
																		other cases like context object , in which case we can not instantiate the Dependency so for that type of situation we have to use 
																		modules and write provider functions to provide those Dependency , we have make a project on this concept..
																		modules comes in the scenario and make these modules as dagger module using annotation
																		we basicallyuse dagger modules to group similar type of provider functions together. 
																	   A module can have more than one  provider functions , its not recommeded for a module to have a state  that means
                                                                       a module should not have  instance variables because that can lead to an unpredictable behaviour and remember you should create a 
																	   module when you actually need it , if you can easily add annotations to constructors of all required dependencies of your project,  you 
																	   should not waste time to create modules 
																	   
															
              How to work with interfaces when 
			  implementing dependency injection  ===> 	
                                                                                      
