
# react-native-ff-rn-azure-notifhub

## Getting started

`$ npm install react-native-ff-rn-azure-notifhub --save`

### Mostly automatic installation

`$ react-native link react-native-ff-rn-azure-notifhub`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-ff-rn-azure-notifhub` and add `RNFfRnAzureNotifhub.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNFfRnAzureNotifhub.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNFfRnAzureNotifhubPackage;` to the imports at the top of the file
  - Add `new RNFfRnAzureNotifhubPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-ff-rn-azure-notifhub'
  	project(':react-native-ff-rn-azure-notifhub').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-ff-rn-azure-notifhub/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-ff-rn-azure-notifhub')
  	```

## Usage
```javascript
import RNFfRnAzureNotifhub from 'react-native-ff-rn-azure-notifhub';

// TODO: What to do with the module?
RNFfRnAzureNotifhub;
```
  