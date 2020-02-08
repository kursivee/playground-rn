## Navigation Experiment

POC project that handles bidirectional navigation between RN and Native. Currently only for Android.

Native -> RN Navigation Concept
- Assumptions
  - Only one instance of RN Activity "launchMode=SingleActivity"
- Native sends RN Event to navigate to new RN Screen
- On RN Nav complete, RN sends event to Native to navigate back to RN Activity

RN -> Native Navigation Concept
- Native defines navigation module that navigates to new activity
- RN calls navigation modules methods to navigate
