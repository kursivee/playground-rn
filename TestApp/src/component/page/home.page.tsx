import React, { useEffect } from 'react'
import HomeTemplate from '../template/home.template'
import { connect } from 'react-redux'

interface Props {
    increment: () => void
}

const HomePage: React.FC<Props> = ({ increment }) => {
    useEffect(() => {
        increment()
    }, [])
    return(
        <HomeTemplate />
    )
}

const mapDispatchToProps = (dispatch: any) => ({
    increment: () => dispatch({ type: "INCREMENT" })
})

export default connect(null, mapDispatchToProps)(HomePage)