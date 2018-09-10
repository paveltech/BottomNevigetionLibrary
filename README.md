# BottomNevigetionLibrary
Bottom Nev Library


```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  ```xml
  dependencies {
	        implementation 'com.github.paveltech:BottomNevigetionLibrary:1.0.1'
	}
  ```
  
  
    ```xml
  <android.support.design.widget.BottomNavigationView
        android:id="@+id/bottom_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom"
        android:background="@android:color/white"
        app:layout_behavior="com.example.bottomlibrary.BottomNavigationBehavior"
        design:menu="@menu/tab_menu"/> 
        
        
   ```
