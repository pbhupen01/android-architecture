# Simple implementation of Lists View example.

```
Model: ListData
View: activity_layout
Controller: MainActivity

In this implementation MainActivity acts as Controller.
But it is tightly coupled to View. Which makes it difficult to test.


```

### Model View Controller
In MVC architecture implementation is divided into three parts

#### Model
Data and business logic

#### View
UI

#### Controller
It ties the app together.

Recieves input from User. Update Model and UI accordingly.

Controller interacts with model for any update or query. UI can be updated in two ways on any operation on model.

1. UI may listen to Model for changes and can get notified by Model whenever there is any modification on Model.

2. Controller may update UI on any change in Model. In this case Controller requires reference to UI.


### Model View Presenter
In MVC Activity (controller) was coupled with View. MVP takes care of this situation.
It separates out Controller  in a different class (Presenter) out of the Activity making Activity only a View. This helps in making Controller testable.
