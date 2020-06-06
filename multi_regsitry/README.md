# Multi Registry

Project for studying the behaviour that uses multiple registered RN applications. Should cover navigation across RN and Native components as well as redux interaction.

## Libs
- redux
- react-navigation

## Questions
- How to handle navigation between registries from within RN.
    - Thought is that you might need to define a central navigation structure and just add it to each app registry
    - This should be ok since state managment is handled by redux store


## Findings
- All app registries are initalized at start.
- You can share services across app registries. This theoretically means you should be able to share redux functionality.
- ReactFragment crashes if it gets backed into. This is due to "loadApp" getting called again