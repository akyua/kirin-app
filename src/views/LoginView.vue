<template>
    <Header />
    <main>
        <div class="login-container">
            <h2>Login</h2>
            <form>
                <input placeholder="Email" class="login-input" autocomplete="off">
                <input type="password" placeholder="Password" class="login-input" autocomplete="off">
                <div class="submit">Login</div>
            </form>
            <a href="/forgot" class="link-forgot">Forgot password?</a>
            <a href="/signup" class="link-create signup">Not registered? <span>Create an account</span></a>
        </div>
    </main>
</template>

<script>
import Header from '../components/Header.vue';

export default{
    name: 'Login',
    components: { Header },
}
</script>

<style lang="scss">
main{
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: rgb(31, 31, 31);
    height: 100vh;
    .login-container{
        margin-top: 60px; 
        display: flex;
        flex-direction: column;
        max-width: 400px;
        border-radius: 10px;
        color: white;
        background-color: rgb(19, 19, 19);
        text-align: center;
        padding: 40px;
        h2{
            font-weight: 600;
            padding: 20px 0 40px 0;
            margin-bottom: 40px;
        }
        form{
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            .login-input{
                width: 100%;
                margin-bottom: 20px;
                color: white;
                height: 40px;
                border: 0;
                font-weight: 600;
                padding: 10px 20px;
                font-size: 1.0rem;
                border-radius: 5px;
                background: rgba(29, 34, 37, 0.7);
                border-color: initial;
                &:focus{
                    outline: none;
                }
            }
            
            .submit{
            font-weight: 600;
            padding: 13px 10px;
            width: 100px;
            border-radius: 5px;
            background-color: rgba(0, 172, 252, 0.904);
            cursor: pointer;
            transition: .4s;
            &:hover{
                background-color: rgb(0, 174, 255);
            }
        }
        }
        .link-forgot{
            text-decoration: none;
            color: rgb(126, 126, 126);
            margin: 20px 0 0 0;
        }
        .link-create{
            margin: 50px 0 0 0;
            text-decoration: none;
            color: rgb(126, 126, 126);
            span{
                color: rgb(0, 174, 255);
            }
        }
    }
}
</style>