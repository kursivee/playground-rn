import React from 'react';
import { SafeAreaView } from 'react-native';
import HomePage from './component/page/home.page'
import store from './redux/store'
import { Provider } from 'react-redux'

const App = () => {
  return (
    <Provider store={store}>
      <SafeAreaView>
          <HomePage />
      </SafeAreaView>
    </Provider>
  );
};

export default App;
