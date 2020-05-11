import React from 'react';
import { Text, View } from 'react-native';
import GreetingService, { Types } from './src/greeting/greeting-service'
import greetingContainer from './src/greeting/greeting-container'
import getDectorators from 'inversify-inject-decorators'

const { lazyInject } = getDectorators(greetingContainer)

export interface Props {
  name: string;
  enthusiasmLevel?: number;
}

export default class App extends React.Component {

  @lazyInject(Types.Greeting)
  public greetingSerivce!: GreetingService

  render() {
    return (
      <View>
        <Text>{this.greetingSerivce.hello()}</Text>      
      </View>
    );
  }
};