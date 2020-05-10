import React from 'react';
import { Button, StyleSheet, Text, View } from 'react-native';

export interface Props {
  name: string;
  enthusiasmLevel?: number;
}

const App: React.FC<Props> = (props) => {
  return (
    <View>
      <Text>Hello World</Text>      
    </View>
  );
};

export default App;