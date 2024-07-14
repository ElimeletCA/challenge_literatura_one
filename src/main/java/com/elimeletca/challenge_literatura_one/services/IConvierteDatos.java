package com.elimeletca.challenge_literatura_one.services;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class<T> clase);
}
