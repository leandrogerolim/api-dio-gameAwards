import React from 'react';
import {View, Text, StyleSheet, ImageBackground } from 'react-native';

export function VotesScreen(){
    return (
        <View style={styles.container}>
            <Text>
                Exodia Obliterar teste          
            </Text>
        </View>
    )
}
const styles = StyleSheet.create({
    container:{
        flex: 1,
        color:'#fff',
        backgroundColor:'#191919',
        alignItems:'center',
        justifyContent:'center'
    }
})