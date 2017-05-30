for (i = 0; i < fields.size(); i++) {
    ctx._source[fields[i]] = values[i];
};

for (i = 0; i < increaseFields.size(); i++) {
    if (ctx._source[increaseFields[i]]) {
        ctx._source[increaseFields[i]] += increaseValues[i];
    } else {
        ctx._source[increaseFields[i]] = increaseValues[i];
    };
};