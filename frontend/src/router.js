
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CreateExamManager from "./components/listers/CreateExamCards"
import CreateExamDetail from "./components/listers/CreateExamDetail"

import RequestExamReqManager from "./components/listers/RequestExamReqCards"
import RequestExamReqDetail from "./components/listers/RequestExamReqDetail"

import AnswerUserAnsweredManager from "./components/listers/AnswerUserAnsweredCards"
import AnswerUserAnsweredDetail from "./components/listers/AnswerUserAnsweredDetail"

import ResultExamResultManager from "./components/listers/ResultExamResultCards"
import ResultExamResultDetail from "./components/listers/ResultExamResultDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/creates/exams',
                name: 'CreateExamManager',
                component: CreateExamManager
            },
            {
                path: '/creates/exams/:id',
                name: 'CreateExamDetail',
                component: CreateExamDetail
            },

            {
                path: '/requests/examReqs',
                name: 'RequestExamReqManager',
                component: RequestExamReqManager
            },
            {
                path: '/requests/examReqs/:id',
                name: 'RequestExamReqDetail',
                component: RequestExamReqDetail
            },

            {
                path: '/answers/userAnswereds',
                name: 'AnswerUserAnsweredManager',
                component: AnswerUserAnsweredManager
            },
            {
                path: '/answers/userAnswereds/:id',
                name: 'AnswerUserAnsweredDetail',
                component: AnswerUserAnsweredDetail
            },

            {
                path: '/results/examResults',
                name: 'ResultExamResultManager',
                component: ResultExamResultManager
            },
            {
                path: '/results/examResults/:id',
                name: 'ResultExamResultDetail',
                component: ResultExamResultDetail
            },



    ]
})
