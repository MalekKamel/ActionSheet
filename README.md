[![](https://jitpack.io/v/ShabanKamell/ActionSheet.svg)](https://jitpack.io/#ShabanKamell/ActionSheet)

ActionSheet
===========

ActionSheet is an Android clone of iOS action sheet component, completely typical to iOS7 style.

<img src="https://github.com/ShabanKamell/ActionSheet/blob/master/blob/raw/action_sheet_2.png?raw=true" height="500">

## Installation

#### Gradle:
```groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

dependencies {
        implementation 'com.github.ShabanKamell:ActionSheet:x.y.z'
}
```
(Please replace x, y and z with the latest version numbers: [![](https://jitpack.io/v/ShabanKamell/ActionSheet.svg)](https://jitpack.io/#ShabanKamell/ActionSheet))

#### Usage

#### Kotlin 

```kotlin
     val option1 = ActionItem(title = "Option 1") {
            Toast.makeText(this, "Option 1 selected.", Toast.LENGTH_SHORT).show()
        }
        // You can set a tag
        option1.tag = 0

        val option2 = ActionItem(title = "Option 2", style = Style.DESTRUCTIVE) {
            // action selected
        }
        val option3 = ActionItem(title = "Option 3", isEnabled = false) {
            // action selected
        }
        
        // Using using DSL
         ActionSheet.create {
            title = "TITLE"
            message = "MESSAGE"
            actions = listOf(option1, option2, option3)
            isCancelable = true // true by default
            isCancelableOnActionClick = true // true by default
            show(supportFragmentManager)
        }
        
        // Or using Kotlin Builder
        ActionSheet.Builder()
                .actions(listOf(option1, option2, option3))
                .title("TITLE")
                .message("MESSAGE")
                .show(supportFragmentManager)
```

#### Java

```java
        ActionItem option1 = new ActionItem(
                "Option 1",
                () -> {
                    // Do something
                    return Unit.INSTANCE;
                });
                
        List<ActionItem> actions = new ArrayList<>();
        actions.add(option1);
        
        new ActionSheet.Builder()
                .title("TITLE")
                .message("MESSAGE")
                .actions(actions)
                .isCancelable(true)
                .show(manager);
```

## Contibution

All contributions are always welcome. Just submit a Pull request **PR**.

### 🛡 License
<details>
    <summary>
        click to reveal License
    </summary>
    
```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

</details>

