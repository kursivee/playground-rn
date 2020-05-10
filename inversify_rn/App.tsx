import React, { useEffect } from 'react';
import { Button, StyleSheet, Text, View } from 'react-native';
import GreetingService, { Types } from './src/greeting/greeting-service'
import baseContainer from './src/di/base-container'

export interface Props {
  name: string;
  enthusiasmLevel?: number;
}



const App: React.FC<Props> = (props) => {
  const greetingSerivce: GreetingService = baseContainer.get<GreetingService>(Types.Greeting)
  return (
    <View>
      <Text>{greetingSerivce.hello()}</Text>      
    </View>
  );
};

export default App;