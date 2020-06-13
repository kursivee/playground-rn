import React from 'react'
import { Text, Button } from 'react-native'
import { connect } from 'react-redux'

interface Props {
    count: Number,
    decrement: () => void
}

const Section: React.FC<Props> = ({ count, decrement}) => {
    return (
        <>
            <Text>State is {count}</Text>
            <Button title='DECREMENT' onPress={() => decrement()}></Button>
        </>
    )
}

const mapStateToProps = (state: any) => {
    return {
        count: state
    }
}

const mapDispatchToProps = (dispatch: any) => ({
    decrement: () => dispatch({ type: 'DECREMENT' })
})

export default connect(mapStateToProps, mapDispatchToProps)(Section)