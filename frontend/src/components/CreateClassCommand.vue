<template>

    <v-card outlined>
        <v-card-title>
            CreateClass
        </v-card-title>

        <v-card-text>
            <String label="ClassName" v-model="value.className" :editMode="editMode"/>
            <Number label="Capacity" v-model="value.capacity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createClass"
            >
                CreateClass
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateClassCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.className = '';
            this.value.capacity = 0;
        },
        watch: {
        },
        methods: {
            createClass() {
                this.$emit('createClass', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

